package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.YesNoOptionNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ResponsibleRepaymentDifficultyNodeModule_ProvideYesNoOptionNodeFactory
    implements Factory<YesNoOptionNode<?>> {
  private final ResponsibleRepaymentDifficultyNodeModule module;

  public ResponsibleRepaymentDifficultyNodeModule_ProvideYesNoOptionNodeFactory(
      ResponsibleRepaymentDifficultyNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public YesNoOptionNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideYesNoOptionNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<YesNoOptionNode<?>> create(
      ResponsibleRepaymentDifficultyNodeModule module) {
    return new ResponsibleRepaymentDifficultyNodeModule_ProvideYesNoOptionNodeFactory(module);
  }

  /** Proxies {@link ResponsibleRepaymentDifficultyNodeModule#provideYesNoOptionNode()}. */
  public static YesNoOptionNode<?> proxyProvideYesNoOptionNode(
      ResponsibleRepaymentDifficultyNodeModule instance) {
    return instance.provideYesNoOptionNode();
  }
}
