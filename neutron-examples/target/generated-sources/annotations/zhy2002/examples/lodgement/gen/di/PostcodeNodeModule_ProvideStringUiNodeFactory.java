package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.node.StringUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PostcodeNodeModule_ProvideStringUiNodeFactory
    implements Factory<StringUiNode<?>> {
  private final PostcodeNodeModule module;

  public PostcodeNodeModule_ProvideStringUiNodeFactory(PostcodeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public StringUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideStringUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<StringUiNode<?>> create(PostcodeNodeModule module) {
    return new PostcodeNodeModule_ProvideStringUiNodeFactory(module);
  }

  /** Proxies {@link PostcodeNodeModule#provideStringUiNode()}. */
  public static StringUiNode<?> proxyProvideStringUiNode(PostcodeNodeModule instance) {
    return instance.provideStringUiNode();
  }
}
