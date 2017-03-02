package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsInstitutionNameNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final SavingsInstitutionNameNodeModule module;

  public SavingsInstitutionNameNodeModule_ProvideLeafUiNodeFactory(
      SavingsInstitutionNameNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(SavingsInstitutionNameNodeModule module) {
    return new SavingsInstitutionNameNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link SavingsInstitutionNameNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(SavingsInstitutionNameNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
