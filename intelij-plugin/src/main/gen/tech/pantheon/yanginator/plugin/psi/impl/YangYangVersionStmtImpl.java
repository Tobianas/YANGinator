// This is a generated file. Not intended for manual editing.
package tech.pantheon.yanginator.plugin.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tech.pantheon.yanginator.plugin.psi.YangComment;
import tech.pantheon.yanginator.plugin.psi.YangLineComment;
import tech.pantheon.yanginator.plugin.psi.YangStmtend;
import tech.pantheon.yanginator.plugin.psi.YangVisitor;
import tech.pantheon.yanginator.plugin.psi.YangYangVersionArgStr;
import tech.pantheon.yanginator.plugin.psi.YangYangVersionStmt;

import java.util.List;

import static tech.pantheon.yanginator.plugin.psi.YangTypes.YANG_YANG_VERSION_KEYWORD;

public class YangYangVersionStmtImpl extends YangStatementImpl implements YangYangVersionStmt {

  public YangYangVersionStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull YangVisitor visitor) {
    visitor.visitYangVersionStmt(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) accept((YangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<YangLineComment> getLineCommentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangLineComment.class);
  }

  @Override
  @NotNull
  public List<YangComment> getCommentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangComment.class);
  }

  @Override
  @Nullable
  public YangStmtend getStmtend() {
    return findChildByClass(YangStmtend.class);
  }

  @Override
  @Nullable
  public YangYangVersionArgStr getYangVersionArgStr() {
    return findChildByClass(YangYangVersionArgStr.class);
  }

  @Override
  @NotNull
  public PsiElement getYangVersionKeyword() {
    return findNotNullChildByType(YANG_YANG_VERSION_KEYWORD);
  }

}
