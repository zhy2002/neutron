package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.MovedToCurrentAddressNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MovedToCurrentAddressNodeModule_ProvideMovedToCurrentAddressNodeFactory
    implements Factory<MovedToCurrentAddressNode> {
  private final MovedToCurrentAddressNodeModule module;

  public MovedToCurrentAddressNodeModule_ProvideMovedToCurrentAddressNodeFactory(
      MovedToCurrentAddressNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public MovedToCurrentAddressNode get() {
    return Preconditions.checkNotNull(
        module.provideMovedToCurrentAddressNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MovedToCurrentAddressNode> create(MovedToCurrentAddressNodeModule module) {
    return new MovedToCurrentAddressNodeModule_ProvideMovedToCurrentAddressNodeFactory(module);
  }

  /** Proxies {@link MovedToCurrentAddressNodeModule#provideMovedToCurrentAddressNode()}. */
  public static MovedToCurrentAddressNode proxyProvideMovedToCurrentAddressNode(
      MovedToCurrentAddressNodeModule instance) {
    return instance.provideMovedToCurrentAddressNode();
  }
}
