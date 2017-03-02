package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.UsedAsSecurityFlagNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UsedAsSecurityFlagNodeModule_ProvideUsedAsSecurityFlagNodeFactory
    implements Factory<UsedAsSecurityFlagNode> {
  private final UsedAsSecurityFlagNodeModule module;

  public UsedAsSecurityFlagNodeModule_ProvideUsedAsSecurityFlagNodeFactory(
      UsedAsSecurityFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UsedAsSecurityFlagNode get() {
    return Preconditions.checkNotNull(
        module.provideUsedAsSecurityFlagNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UsedAsSecurityFlagNode> create(UsedAsSecurityFlagNodeModule module) {
    return new UsedAsSecurityFlagNodeModule_ProvideUsedAsSecurityFlagNodeFactory(module);
  }

  /** Proxies {@link UsedAsSecurityFlagNodeModule#provideUsedAsSecurityFlagNode()}. */
  public static UsedAsSecurityFlagNode proxyProvideUsedAsSecurityFlagNode(
      UsedAsSecurityFlagNodeModule instance) {
    return instance.provideUsedAsSecurityFlagNode();
  }
}
