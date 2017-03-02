package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.node.StringUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageTermRemainingPeriodNodeModule_ProvideStringUiNodeFactory
    implements Factory<StringUiNode<?>> {
  private final MortgageTermRemainingPeriodNodeModule module;

  public MortgageTermRemainingPeriodNodeModule_ProvideStringUiNodeFactory(
      MortgageTermRemainingPeriodNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public StringUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideStringUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<StringUiNode<?>> create(MortgageTermRemainingPeriodNodeModule module) {
    return new MortgageTermRemainingPeriodNodeModule_ProvideStringUiNodeFactory(module);
  }

  /** Proxies {@link MortgageTermRemainingPeriodNodeModule#provideStringUiNode()}. */
  public static StringUiNode<?> proxyProvideStringUiNode(
      MortgageTermRemainingPeriodNodeModule instance) {
    return instance.provideStringUiNode();
  }
}
