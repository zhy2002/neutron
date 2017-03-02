package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.SuburbNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SuburbNodeModule_ProvideSuburbNodeFactory implements Factory<SuburbNode> {
  private final SuburbNodeModule module;

  public SuburbNodeModule_ProvideSuburbNodeFactory(SuburbNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public SuburbNode get() {
    return Preconditions.checkNotNull(
        module.provideSuburbNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SuburbNode> create(SuburbNodeModule module) {
    return new SuburbNodeModule_ProvideSuburbNodeFactory(module);
  }

  /** Proxies {@link SuburbNodeModule#provideSuburbNode()}. */
  public static SuburbNode proxyProvideSuburbNode(SuburbNodeModule instance) {
    return instance.provideSuburbNode();
  }
}
