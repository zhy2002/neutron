package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.AccessOtherDescriptionNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AccessOtherDescriptionNodeModule_ProvideAccessOtherDescriptionNodeFactory
    implements Factory<AccessOtherDescriptionNode> {
  private final AccessOtherDescriptionNodeModule module;

  public AccessOtherDescriptionNodeModule_ProvideAccessOtherDescriptionNodeFactory(
      AccessOtherDescriptionNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public AccessOtherDescriptionNode get() {
    return Preconditions.checkNotNull(
        module.provideAccessOtherDescriptionNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<AccessOtherDescriptionNode> create(
      AccessOtherDescriptionNodeModule module) {
    return new AccessOtherDescriptionNodeModule_ProvideAccessOtherDescriptionNodeFactory(module);
  }

  /** Proxies {@link AccessOtherDescriptionNodeModule#provideAccessOtherDescriptionNode()}. */
  public static AccessOtherDescriptionNode proxyProvideAccessOtherDescriptionNode(
      AccessOtherDescriptionNodeModule instance) {
    return instance.provideAccessOtherDescriptionNode();
  }
}
