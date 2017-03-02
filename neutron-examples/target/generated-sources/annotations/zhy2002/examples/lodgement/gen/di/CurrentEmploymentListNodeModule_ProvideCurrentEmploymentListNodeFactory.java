package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.CurrentEmploymentListNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CurrentEmploymentListNodeModule_ProvideCurrentEmploymentListNodeFactory
    implements Factory<CurrentEmploymentListNode> {
  private final CurrentEmploymentListNodeModule module;

  public CurrentEmploymentListNodeModule_ProvideCurrentEmploymentListNodeFactory(
      CurrentEmploymentListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public CurrentEmploymentListNode get() {
    return Preconditions.checkNotNull(
        module.provideCurrentEmploymentListNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CurrentEmploymentListNode> create(CurrentEmploymentListNodeModule module) {
    return new CurrentEmploymentListNodeModule_ProvideCurrentEmploymentListNodeFactory(module);
  }

  /** Proxies {@link CurrentEmploymentListNodeModule#provideCurrentEmploymentListNode()}. */
  public static CurrentEmploymentListNode proxyProvideCurrentEmploymentListNode(
      CurrentEmploymentListNodeModule instance) {
    return instance.provideCurrentEmploymentListNode();
  }
}
