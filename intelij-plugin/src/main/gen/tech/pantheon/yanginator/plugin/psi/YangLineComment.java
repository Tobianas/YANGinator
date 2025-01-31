// This is a generated file. Not intended for manual editing.
package tech.pantheon.yanginator.plugin.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface YangLineComment extends YangNamedElement {

  @Nullable
  YangNewLineCharacters getNewLineCharacters();

  @NotNull
  List<YangSingleLineCharacters> getSingleLineCharactersList();

  @NotNull
  PsiElement getSingleLineCommentStart();

}
