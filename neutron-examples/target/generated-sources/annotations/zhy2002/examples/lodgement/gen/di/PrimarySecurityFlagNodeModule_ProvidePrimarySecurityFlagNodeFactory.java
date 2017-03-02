package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.PrimarySecurityFlagNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PrimarySecurityFlagNodeModule_ProvidePrimarySecurityFlagNodeFactory
    implements Factory<PrimarySecurityFlagNode> {
  private final PrimarySecurityFlagNodeModule module;

  public PrimarySecurityFlagNodeModule_ProvidePrimarySecurityFlagNodeFactory(
      PrimarySecurityFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public PrimarySecurityFlagNode get() {
    return Preconditions.checkNotNull(
        module.providePrimarySecurityFlagNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<PrimarySecurityFlagNode> create(PrimarySecurityFlagNodeModule module) {
    return new PrimarySecurityFlagNodeModule_ProvidePrimarySecurityFlagNodeFactory(module);
  }

  /** Proxies {@link PrimarySecurityFlagNodeModule#providePrimarySecurityFlagNode()}. */
  public static PrimarySecurityFlagNode proxyProvidePrimarySecurityFlagNode(
      PrimarySecurityFlagNodeModule instance) {
    return instance.providePrimarySecurityFlagNode();
  }
}
