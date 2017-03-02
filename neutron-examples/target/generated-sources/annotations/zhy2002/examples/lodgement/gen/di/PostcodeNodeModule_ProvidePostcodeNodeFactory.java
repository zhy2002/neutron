package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.PostcodeNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PostcodeNodeModule_ProvidePostcodeNodeFactory implements Factory<PostcodeNode> {
  private final PostcodeNodeModule module;

  public PostcodeNodeModule_ProvidePostcodeNodeFactory(PostcodeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public PostcodeNode get() {
    return Preconditions.checkNotNull(
        module.providePostcodeNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<PostcodeNode> create(PostcodeNodeModule module) {
    return new PostcodeNodeModule_ProvidePostcodeNodeFactory(module);
  }

  /** Proxies {@link PostcodeNodeModule#providePostcodeNode()}. */
  public static PostcodeNode proxyProvidePostcodeNode(PostcodeNodeModule instance) {
    return instance.providePostcodeNode();
  }
}
