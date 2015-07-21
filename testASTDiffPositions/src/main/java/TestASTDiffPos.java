import com.github.gumtreediff.actions.ActionGenerator;
import com.github.gumtreediff.actions.model.Action;
import com.github.gumtreediff.gen.jdt.JdtTreeGenerator;
import com.github.gumtreediff.matchers.Matcher;
import com.github.gumtreediff.matchers.Matchers;
import com.github.gumtreediff.tree.ITree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by michaelhilton on 7/21/15.
 */
public class TestASTDiffPos {

    public static void main(String[] args) {


        ITree beforeTree = null;
        ITree afterTree = null;


        String afterFileSrc = null;
        String beforeFileSrc = null;
        try {
            beforeFileSrc = new String(Files.readAllBytes(Paths.get("source1.java")));
            afterFileSrc = new String(Files.readAllBytes(Paths.get("source2.java")));
        } catch (IOException e) {
            e.printStackTrace();
        }


        afterTree = getTreeFromDiff(afterFileSrc);
        beforeTree = getTreeFromDiff(beforeFileSrc);


        //Method that will find AST diffs.  It returns an Array of "Actions" which is a list of element Data objects.
        List<Action> actions = findASTDiffs(beforeTree, afterTree);
        System.out.println(actions);


    }


    public static ITree getTreeFromDiff(String fileContents) {
        ITree src = null;
        try {
            src = new JdtTreeGenerator().generateFromString(fileContents).getRoot();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return src;
    }

    public static List<Action> findASTDiffs(ITree src, ITree dst) {
        List<Action> actions = null;
        try {
            Matcher m = Matchers.getInstance().getMatcher(src, dst); // retrieve the default matcher
            m.match();
            ActionGenerator g = new ActionGenerator(src, dst, m.getMappings());
            g.generate();
            actions = g.getActions(); // return the actions
        } catch (UnsupportedOperationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return actions;
    }


}