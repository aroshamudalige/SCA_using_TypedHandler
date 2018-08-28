package Algorithms;
import com.github.javaparser.ast.body.MethodDeclaration;
import java.io.FileInputStream;

public class Guideline06_09{
    public String runalgorithm(String in) throws Exception {
        boolean isviolated = false;
        int line = 0;
        //FileInputStream in = new FileInputStream("C:\\Users\\arosh\\IdeaProjects\\JavaParserGradle\\NonCompliantCodes\\06_09.java");
        CodeComponents cc = new CodeComponents(in);
        for (MethodDeclaration n:cc.methoddeclarations
             ) {
            if(n.getNameAsString().equals("equals")){
                isviolated = true;
                line = n.getName().getBegin().get().line;
            }
        }
        for (MethodDeclaration n:cc.methoddeclarations
                ) {
            if(n.getNameAsString().equals("hashCode")){
                isviolated = false;
            }
        }
        if(isviolated){
            return ("Guideline violated at " + line);
        }
        //System.out.println("Guideline not violated");
        return  "";
    }
}
