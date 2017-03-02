package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.MortgageLenderInstitutionNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageLenderInstitutionNodeModule_ProvideMortgageLenderInstitutionNodeFactory
    implements Factory<MortgageLenderInstitutionNode> {
  private final MortgageLenderInstitutionNodeModule module;

  public MortgageLenderInstitutionNodeModule_ProvideMortgageLenderInstitutionNodeFactory(
      MortgageLenderInstitutionNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public MortgageLenderInstitutionNode get() {
    return Preconditions.checkNotNull(
        module.provideMortgageLenderInstitutionNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MortgageLenderInstitutionNode> create(
      MortgageLenderInstitutionNodeModule module) {
    return new MortgageLenderInstitutionNodeModule_ProvideMortgageLenderInstitutionNodeFactory(
        module);
  }

  /** Proxies {@link MortgageLenderInstitutionNodeModule#provideMortgageLenderInstitutionNode()}. */
  public static MortgageLenderInstitutionNode proxyProvideMortgageLenderInstitutionNode(
      MortgageLenderInstitutionNodeModule instance) {
    return instance.provideMortgageLenderInstitutionNode();
  }
}
