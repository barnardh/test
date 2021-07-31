
import com.example.test.TestLexer;
import com.example.test.TestParser;
import com.example.test.visitor.TestListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BarnardH
 */
public class Main {
 
    public static void main(String[] args) throws Exception {
        CharStream stream = CharStreams.fromFileName("Input.txt");
        TestLexer lexer = new TestLexer(stream);
        TestParser parser = new TestParser(new CommonTokenStream(lexer));
        parser.setBuildParseTree(true);

        TestParser.ParseContext tree = parser.parse();
    
        ParseTreeWalker walker = new ParseTreeWalker();
        TestListener listener = new TestListener();
        walker.walk(listener, tree);
    }
    
}
