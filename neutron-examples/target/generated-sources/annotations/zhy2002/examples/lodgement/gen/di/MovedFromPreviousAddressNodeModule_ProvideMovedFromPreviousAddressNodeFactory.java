package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.MovedFromPreviousAddressNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MovedFromPreviousAddressNodeModule_ProvideMovedFromPreviousAddressNodeFactory
    implements Factory<MovedFromPreviousAddressNode> {
  private final MovedFromPreviousAddressNodeModule module;

  public MovedFromPreviousAddressNodeModule_ProvideMovedFromPreviousAddressNodeFactory(
      MovedFromPreviousAddressNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public MovedFromPreviousAddressNode get() {
    return Preconditions.checkNotNull(
        module.provideMovedFromPreviousAddressNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MovedFromPreviousAddressNode> create(
      MovedFromPreviousAddressNodeModule module) {
    return new MovedFromPreviousAddressNodeModule_ProvideMovedFromPreviousAddressNodeFactory(
        module);
  }

  /** Proxies {@link MovedFromPreviousAddressNodeModule#provideMovedFromPreviousAddressNode()}. */
  public static MovedFromPreviousAddressNode proxyProvideMovedFromPreviousAddressNode(
      MovedFromPreviousAddressNodeModule instance) {
    return instance.provideMovedFromPreviousAddressNode();
  }
}
