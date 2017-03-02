package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmailNodeModule_ProvideLeafUiNodeFactory implements Factory<LeafUiNode<?, ?>> {
  private final EmailNodeModule module;

  public EmailNodeModule_ProvideLeafUiNodeFactory(EmailNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(EmailNodeModule module) {
    return new EmailNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link EmailNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(EmailNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
