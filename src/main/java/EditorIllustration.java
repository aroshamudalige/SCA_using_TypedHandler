import com.intellij.openapi.actionSystem.*;
import com.intellij.openapi.editor.actionSystem.*;


public class EditorIllustration extends AnAction {

    static {
        final EditorActionManager actionManager = EditorActionManager.getInstance();
        final TypedAction typedAction = actionManager.getTypedAction();
        typedAction.setupRawHandler(new MyTypedHandler(typedAction.getRawHandler()));
    }

    @Override
    public void actionPerformed(final AnActionEvent e) {

    }
}