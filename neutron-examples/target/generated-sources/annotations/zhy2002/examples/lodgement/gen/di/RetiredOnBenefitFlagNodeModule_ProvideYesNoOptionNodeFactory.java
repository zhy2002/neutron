package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.YesNoOptionNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RetiredOnBenefitFlagNodeModule_ProvideYesNoOptionNodeFactory
    implements Factory<YesNoOptionNode<?>> {
  private final RetiredOnBenefitFlagNodeModule module;

  public RetiredOnBenefitFlagNodeModule_ProvideYesNoOptionNodeFactory(
      RetiredOnBenefitFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public YesNoOptionNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideYesNoOptionNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<YesNoOptionNode<?>> create(RetiredOnBenefitFlagNodeModule module) {
    return new RetiredOnBenefitFlagNodeModule_ProvideYesNoOptionNodeFactory(module);
  }

  /** Proxies {@link RetiredOnBenefitFlagNodeModule#provideYesNoOptionNode()}. */
  public static YesNoOptionNode<?> proxyProvideYesNoOptionNode(
      RetiredOnBenefitFlagNodeModule instance) {
    return instance.provideYesNoOptionNode();
  }
}
