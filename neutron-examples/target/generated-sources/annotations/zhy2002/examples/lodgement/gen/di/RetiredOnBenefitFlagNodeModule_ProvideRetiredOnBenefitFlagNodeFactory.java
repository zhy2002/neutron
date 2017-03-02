package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.RetiredOnBenefitFlagNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RetiredOnBenefitFlagNodeModule_ProvideRetiredOnBenefitFlagNodeFactory
    implements Factory<RetiredOnBenefitFlagNode> {
  private final RetiredOnBenefitFlagNodeModule module;

  public RetiredOnBenefitFlagNodeModule_ProvideRetiredOnBenefitFlagNodeFactory(
      RetiredOnBenefitFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public RetiredOnBenefitFlagNode get() {
    return Preconditions.checkNotNull(
        module.provideRetiredOnBenefitFlagNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<RetiredOnBenefitFlagNode> create(RetiredOnBenefitFlagNodeModule module) {
    return new RetiredOnBenefitFlagNodeModule_ProvideRetiredOnBenefitFlagNodeFactory(module);
  }

  /** Proxies {@link RetiredOnBenefitFlagNodeModule#provideRetiredOnBenefitFlagNode()}. */
  public static RetiredOnBenefitFlagNode proxyProvideRetiredOnBenefitFlagNode(
      RetiredOnBenefitFlagNodeModule instance) {
    return instance.provideRetiredOnBenefitFlagNode();
  }
}
