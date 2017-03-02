package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.MovedToPreviousAddressNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MovedToPreviousAddressNodeModule_ProvideMovedToPreviousAddressNodeFactory
    implements Factory<MovedToPreviousAddressNode> {
  private final MovedToPreviousAddressNodeModule module;

  public MovedToPreviousAddressNodeModule_ProvideMovedToPreviousAddressNodeFactory(
      MovedToPreviousAddressNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public MovedToPreviousAddressNode get() {
    return Preconditions.checkNotNull(
        module.provideMovedToPreviousAddressNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MovedToPreviousAddressNode> create(
      MovedToPreviousAddressNodeModule module) {
    return new MovedToPreviousAddressNodeModule_ProvideMovedToPreviousAddressNodeFactory(module);
  }

  /** Proxies {@link MovedToPreviousAddressNodeModule#provideMovedToPreviousAddressNode()}. */
  public static MovedToPreviousAddressNode proxyProvideMovedToPreviousAddressNode(
      MovedToPreviousAddressNodeModule instance) {
    return instance.provideMovedToPreviousAddressNode();
  }
}
