// This is a generated file. Not intended for manual editing.
package tech.pantheon.yanginator.plugin.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import tech.pantheon.yanginator.plugin.psi.YangPrefix;
import tech.pantheon.yanginator.plugin.psi.YangPrefixArg;
import tech.pantheon.yanginator.plugin.psi.YangVisitor;

public class YangPrefixArgImpl extends YangNamedElementImpl implements YangPrefixArg {

  public YangPrefixArgImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YangVisitor visitor) {
    visitor.visitPrefixArg(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) accept((YangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public YangPrefix getPrefix() {
    return findNotNullChildByClass(YangPrefix.class);
  }

}
