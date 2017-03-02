package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.node.StringUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherIncomeDescriptionNodeModule_ProvideStringUiNodeFactory
    implements Factory<StringUiNode<?>> {
  private final OtherIncomeDescriptionNodeModule module;

  public OtherIncomeDescriptionNodeModule_ProvideStringUiNodeFactory(
      OtherIncomeDescriptionNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public StringUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideStringUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<StringUiNode<?>> create(OtherIncomeDescriptionNodeModule module) {
    return new OtherIncomeDescriptionNodeModule_ProvideStringUiNodeFactory(module);
  }

  /** Proxies {@link OtherIncomeDescriptionNodeModule#provideStringUiNode()}. */
  public static StringUiNode<?> proxyProvideStringUiNode(
      OtherIncomeDescriptionNodeModule instance) {
    return instance.provideStringUiNode();
  }
}
