package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ObjectUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherIncomeNodeModule_ProvideObjectUiNodeFactory
    implements Factory<ObjectUiNode<?>> {
  private final OtherIncomeNodeModule module;

  public OtherIncomeNodeModule_ProvideObjectUiNodeFactory(OtherIncomeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ObjectUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideObjectUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ObjectUiNode<?>> create(OtherIncomeNodeModule module) {
    return new OtherIncomeNodeModule_ProvideObjectUiNodeFactory(module);
  }

  /** Proxies {@link OtherIncomeNodeModule#provideObjectUiNode()}. */
  public static ObjectUiNode<?> proxyProvideObjectUiNode(OtherIncomeNodeModule instance) {
    return instance.provideObjectUiNode();
  }
}
