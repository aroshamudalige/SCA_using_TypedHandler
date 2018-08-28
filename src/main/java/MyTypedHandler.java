import Algorithms.Guideline06_09;
import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.editor.*;
import com.intellij.openapi.editor.actionSystem.TypedActionHandler;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;

public class MyTypedHandler implements TypedActionHandler {
    private TypedActionHandler myOriginalHandler;
    String result = "";

    public MyTypedHandler(TypedActionHandler originalHandler){
        myOriginalHandler = originalHandler;
    }
    @Override
    public void execute(@NotNull Editor editor, char c, @NotNull DataContext dataContext){
        myOriginalHandler.execute(editor, c, dataContext);
        final Document document = editor.getDocument();
        final Project project = editor.getProject();
        try {
            Guideline06_09 obj = new Guideline06_09();
            String result = obj.runalgorithm(document.getText());
            if(!result.isEmpty()){
                Messages.showMessageDialog(project, result, "SCA Arosha", Messages.getInformationIcon());
            }
        }catch (Exception e){

        }
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

            }
        };
        WriteCommandAction.runWriteCommandAction(project, runnable);
    }
}