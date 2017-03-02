package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.AccessNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AccessNodeModule_ProvideAccessNodeFactory implements Factory<AccessNode> {
  private final AccessNodeModule module;

  public AccessNodeModule_ProvideAccessNodeFactory(AccessNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public AccessNode get() {
    return Preconditions.checkNotNull(
        module.provideAccessNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<AccessNode> create(AccessNodeModule module) {
    return new AccessNodeModule_ProvideAccessNodeFactory(module);
  }

  /** Proxies {@link AccessNodeModule#provideAccessNode()}. */
  public static AccessNode proxyProvideAccessNode(AccessNodeModule instance) {
    return instance.provideAccessNode();
  }
}
