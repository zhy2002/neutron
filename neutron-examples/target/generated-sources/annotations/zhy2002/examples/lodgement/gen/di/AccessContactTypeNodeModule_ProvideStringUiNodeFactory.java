package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.node.StringUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AccessContactTypeNodeModule_ProvideStringUiNodeFactory
    implements Factory<StringUiNode<?>> {
  private final AccessContactTypeNodeModule module;

  public AccessContactTypeNodeModule_ProvideStringUiNodeFactory(
      AccessContactTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public StringUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideStringUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<StringUiNode<?>> create(AccessContactTypeNodeModule module) {
    return new AccessContactTypeNodeModule_ProvideStringUiNodeFactory(module);
  }

  /** Proxies {@link AccessContactTypeNodeModule#provideStringUiNode()}. */
  public static StringUiNode<?> proxyProvideStringUiNode(AccessContactTypeNodeModule instance) {
    return instance.provideStringUiNode();
  }
}
