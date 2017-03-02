package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ResponsibleRepaymentDifficultyNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final
class ResponsibleRepaymentDifficultyNodeModule_ProvideResponsibleRepaymentDifficultyNodeFactory
    implements Factory<ResponsibleRepaymentDifficultyNode> {
  private final ResponsibleRepaymentDifficultyNodeModule module;

  public ResponsibleRepaymentDifficultyNodeModule_ProvideResponsibleRepaymentDifficultyNodeFactory(
      ResponsibleRepaymentDifficultyNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ResponsibleRepaymentDifficultyNode get() {
    return Preconditions.checkNotNull(
        module.provideResponsibleRepaymentDifficultyNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ResponsibleRepaymentDifficultyNode> create(
      ResponsibleRepaymentDifficultyNodeModule module) {
    return new ResponsibleRepaymentDifficultyNodeModule_ProvideResponsibleRepaymentDifficultyNodeFactory(
        module);
  }

  /**
   * Proxies {@link
   * ResponsibleRepaymentDifficultyNodeModule#provideResponsibleRepaymentDifficultyNode()}.
   */
  public static ResponsibleRepaymentDifficultyNode proxyProvideResponsibleRepaymentDifficultyNode(
      ResponsibleRepaymentDifficultyNodeModule instance) {
    return instance.provideResponsibleRepaymentDifficultyNode();
  }
}
