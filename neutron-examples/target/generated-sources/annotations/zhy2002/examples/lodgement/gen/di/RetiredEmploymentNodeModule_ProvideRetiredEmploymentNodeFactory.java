package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.RetiredEmploymentNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RetiredEmploymentNodeModule_ProvideRetiredEmploymentNodeFactory
    implements Factory<RetiredEmploymentNode> {
  private final RetiredEmploymentNodeModule module;

  public RetiredEmploymentNodeModule_ProvideRetiredEmploymentNodeFactory(
      RetiredEmploymentNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public RetiredEmploymentNode get() {
    return Preconditions.checkNotNull(
        module.provideRetiredEmploymentNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<RetiredEmploymentNode> create(RetiredEmploymentNodeModule module) {
    return new RetiredEmploymentNodeModule_ProvideRetiredEmploymentNodeFactory(module);
  }

  /** Proxies {@link RetiredEmploymentNodeModule#provideRetiredEmploymentNode()}. */
  public static RetiredEmploymentNode proxyProvideRetiredEmploymentNode(
      RetiredEmploymentNodeModule instance) {
    return instance.provideRetiredEmploymentNode();
  }
}
