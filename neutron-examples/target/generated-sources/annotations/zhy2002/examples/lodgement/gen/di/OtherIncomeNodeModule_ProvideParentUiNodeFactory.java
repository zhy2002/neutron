package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherIncomeNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final OtherIncomeNodeModule module;

  public OtherIncomeNodeModule_ProvideParentUiNodeFactory(OtherIncomeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(OtherIncomeNodeModule module) {
    return new OtherIncomeNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link OtherIncomeNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(OtherIncomeNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
