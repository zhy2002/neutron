package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ObjectUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyGeneralNodeModule_ProvideObjectUiNodeFactory
    implements Factory<ObjectUiNode<?>> {
  private final CompanyGeneralNodeModule module;

  public CompanyGeneralNodeModule_ProvideObjectUiNodeFactory(CompanyGeneralNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ObjectUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideObjectUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ObjectUiNode<?>> create(CompanyGeneralNodeModule module) {
    return new CompanyGeneralNodeModule_ProvideObjectUiNodeFactory(module);
  }

  /** Proxies {@link CompanyGeneralNodeModule#provideObjectUiNode()}. */
  public static ObjectUiNode<?> proxyProvideObjectUiNode(CompanyGeneralNodeModule instance) {
    return instance.provideObjectUiNode();
  }
}
