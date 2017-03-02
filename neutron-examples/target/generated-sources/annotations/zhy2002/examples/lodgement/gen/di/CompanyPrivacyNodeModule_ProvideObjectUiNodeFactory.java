package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ObjectUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyPrivacyNodeModule_ProvideObjectUiNodeFactory
    implements Factory<ObjectUiNode<?>> {
  private final CompanyPrivacyNodeModule module;

  public CompanyPrivacyNodeModule_ProvideObjectUiNodeFactory(CompanyPrivacyNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ObjectUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideObjectUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ObjectUiNode<?>> create(CompanyPrivacyNodeModule module) {
    return new CompanyPrivacyNodeModule_ProvideObjectUiNodeFactory(module);
  }

  /** Proxies {@link CompanyPrivacyNodeModule#provideObjectUiNode()}. */
  public static ObjectUiNode<?> proxyProvideObjectUiNode(CompanyPrivacyNodeModule instance) {
    return instance.provideObjectUiNode();
  }
}
