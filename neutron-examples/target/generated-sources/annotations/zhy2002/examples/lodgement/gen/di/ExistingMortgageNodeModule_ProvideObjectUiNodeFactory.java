package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ObjectUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ExistingMortgageNodeModule_ProvideObjectUiNodeFactory
    implements Factory<ObjectUiNode<?>> {
  private final ExistingMortgageNodeModule module;

  public ExistingMortgageNodeModule_ProvideObjectUiNodeFactory(ExistingMortgageNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ObjectUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideObjectUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ObjectUiNode<?>> create(ExistingMortgageNodeModule module) {
    return new ExistingMortgageNodeModule_ProvideObjectUiNodeFactory(module);
  }

  /** Proxies {@link ExistingMortgageNodeModule#provideObjectUiNode()}. */
  public static ObjectUiNode<?> proxyProvideObjectUiNode(ExistingMortgageNodeModule instance) {
    return instance.provideObjectUiNode();
  }
}
