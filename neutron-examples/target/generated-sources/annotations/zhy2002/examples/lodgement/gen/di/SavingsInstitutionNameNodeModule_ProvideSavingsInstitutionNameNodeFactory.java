package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.SavingsInstitutionNameNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsInstitutionNameNodeModule_ProvideSavingsInstitutionNameNodeFactory
    implements Factory<SavingsInstitutionNameNode> {
  private final SavingsInstitutionNameNodeModule module;

  public SavingsInstitutionNameNodeModule_ProvideSavingsInstitutionNameNodeFactory(
      SavingsInstitutionNameNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public SavingsInstitutionNameNode get() {
    return Preconditions.checkNotNull(
        module.provideSavingsInstitutionNameNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SavingsInstitutionNameNode> create(
      SavingsInstitutionNameNodeModule module) {
    return new SavingsInstitutionNameNodeModule_ProvideSavingsInstitutionNameNodeFactory(module);
  }

  /** Proxies {@link SavingsInstitutionNameNodeModule#provideSavingsInstitutionNameNode()}. */
  public static SavingsInstitutionNameNode proxyProvideSavingsInstitutionNameNode(
      SavingsInstitutionNameNodeModule instance) {
    return instance.provideSavingsInstitutionNameNode();
  }
}
