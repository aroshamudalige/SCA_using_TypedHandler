import Algorithms.Guideline06_09;
import com.intellij.codeInsight.editorActions.TypedHandlerDelegate;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.psi.PsiFile;

public class MyTypedHandlerDelegate extends TypedHandlerDelegate {
    @Override
    public Result charTyped(char c, Project project, Editor editor, PsiFile file) {
        return Result.CONTINUE;
    }
}