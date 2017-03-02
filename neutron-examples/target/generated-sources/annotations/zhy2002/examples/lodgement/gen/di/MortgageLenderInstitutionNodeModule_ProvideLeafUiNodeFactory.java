package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageLenderInstitutionNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final MortgageLenderInstitutionNodeModule module;

  public MortgageLenderInstitutionNodeModule_ProvideLeafUiNodeFactory(
      MortgageLenderInstitutionNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(MortgageLenderInstitutionNodeModule module) {
    return new MortgageLenderInstitutionNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link MortgageLenderInstitutionNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(
      MortgageLenderInstitutionNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
