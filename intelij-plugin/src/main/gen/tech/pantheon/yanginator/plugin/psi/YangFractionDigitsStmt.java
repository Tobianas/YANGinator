// This is a generated file. Not intended for manual editing.
package tech.pantheon.yanginator.plugin.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface YangFractionDigitsStmt extends YangStatement {

  @NotNull
  List<YangLineComment> getLineCommentList();

  @NotNull
  List<YangComment> getCommentList();

  @Nullable
  YangFractionDigitsArgStr getFractionDigitsArgStr();

  @Nullable
  YangStmtend getStmtend();

  @NotNull
  PsiElement getFractionDigitsKeyword();

}
