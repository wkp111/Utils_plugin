package com.wkp.utils.action;

import com.intellij.ide.IdeView;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.LangDataKeys;
import com.intellij.psi.JavaDirectoryService;
import com.intellij.psi.PsiDirectory;

public class CreateFileUtilsAction extends AnAction {
    @Override
    public void actionPerformed(AnActionEvent e) {
        IdeView ideView = e.getData(LangDataKeys.IDE_VIEW);
        if (ideView != null) {
            PsiDirectory psiDirectory = ideView.getOrChooseDirectory();
            if (psiDirectory != null) {
                JavaDirectoryService.getInstance().createClass(psiDirectory, "FileUtils","FileUtils");
            }
        }
    }
}
