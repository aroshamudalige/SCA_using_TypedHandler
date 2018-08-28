package Algorithms;
import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.visitor.VoidVisitor;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class CodeComponents{
    //public static Map<String, Integer> methodNames = new HashMap<String, Integer>();
    public static List<MethodDeclaration> methoddeclarations = new ArrayList<MethodDeclaration>();

    CodeComponents(String in) throws Exception{
        //JavaParser.getStaticConfiguration().setAttributeComments(false);
        CompilationUnit cu;
        cu = JavaParser.parse(in);
        VoidVisitor<List<MethodDeclaration>> MethodVisitor = new MethodVisitor();
        MethodVisitor.visit(cu, methoddeclarations);
    }

    private static class MethodVisitor extends VoidVisitorAdapter<List<MethodDeclaration>> {
        @Override
        public void visit(MethodDeclaration n, List<MethodDeclaration> collector) {
            super.visit(n, collector);
            collector.add(n);
        }
    }
}
