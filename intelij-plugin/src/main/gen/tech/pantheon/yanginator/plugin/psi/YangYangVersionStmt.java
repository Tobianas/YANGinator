// This is a generated file. Not intended for manual editing.
package tech.pantheon.yanginator.plugin.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface YangYangVersionStmt extends YangStatement {

  @NotNull
  List<YangLineComment> getLineCommentList();

  @NotNull
  List<YangComment> getCommentList();

  @NotNull
  YangStmtend getStmtend();

  @NotNull
  YangYangVersionArgStr getYangVersionArgStr();

  @NotNull
  PsiElement getYangVersionKeyword();

}
