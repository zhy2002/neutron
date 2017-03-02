package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.AccessCompanyNameNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AccessCompanyNameNodeModule_ProvideAccessCompanyNameNodeFactory
    implements Factory<AccessCompanyNameNode> {
  private final AccessCompanyNameNodeModule module;

  public AccessCompanyNameNodeModule_ProvideAccessCompanyNameNodeFactory(
      AccessCompanyNameNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public AccessCompanyNameNode get() {
    return Preconditions.checkNotNull(
        module.provideAccessCompanyNameNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<AccessCompanyNameNode> create(AccessCompanyNameNodeModule module) {
    return new AccessCompanyNameNodeModule_ProvideAccessCompanyNameNodeFactory(module);
  }

  /** Proxies {@link AccessCompanyNameNodeModule#provideAccessCompanyNameNode()}. */
  public static AccessCompanyNameNode proxyProvideAccessCompanyNameNode(
      AccessCompanyNameNodeModule instance) {
    return instance.provideAccessCompanyNameNode();
  }
}
