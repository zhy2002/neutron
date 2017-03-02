package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.YesNoOptionNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UnemployedOnBenefitFlagNodeModule_ProvideYesNoOptionNodeFactory
    implements Factory<YesNoOptionNode<?>> {
  private final UnemployedOnBenefitFlagNodeModule module;

  public UnemployedOnBenefitFlagNodeModule_ProvideYesNoOptionNodeFactory(
      UnemployedOnBenefitFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public YesNoOptionNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideYesNoOptionNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<YesNoOptionNode<?>> create(UnemployedOnBenefitFlagNodeModule module) {
    return new UnemployedOnBenefitFlagNodeModule_ProvideYesNoOptionNodeFactory(module);
  }

  /** Proxies {@link UnemployedOnBenefitFlagNodeModule#provideYesNoOptionNode()}. */
  public static YesNoOptionNode<?> proxyProvideYesNoOptionNode(
      UnemployedOnBenefitFlagNodeModule instance) {
    return instance.provideYesNoOptionNode();
  }
}
