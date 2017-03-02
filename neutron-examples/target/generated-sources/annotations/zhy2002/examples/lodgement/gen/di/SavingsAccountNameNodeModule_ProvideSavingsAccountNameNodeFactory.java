package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.SavingsAccountNameNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsAccountNameNodeModule_ProvideSavingsAccountNameNodeFactory
    implements Factory<SavingsAccountNameNode> {
  private final SavingsAccountNameNodeModule module;

  public SavingsAccountNameNodeModule_ProvideSavingsAccountNameNodeFactory(
      SavingsAccountNameNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public SavingsAccountNameNode get() {
    return Preconditions.checkNotNull(
        module.provideSavingsAccountNameNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SavingsAccountNameNode> create(SavingsAccountNameNodeModule module) {
    return new SavingsAccountNameNodeModule_ProvideSavingsAccountNameNodeFactory(module);
  }

  /** Proxies {@link SavingsAccountNameNodeModule#provideSavingsAccountNameNode()}. */
  public static SavingsAccountNameNode proxyProvideSavingsAccountNameNode(
      SavingsAccountNameNodeModule instance) {
    return instance.provideSavingsAccountNameNode();
  }
}
