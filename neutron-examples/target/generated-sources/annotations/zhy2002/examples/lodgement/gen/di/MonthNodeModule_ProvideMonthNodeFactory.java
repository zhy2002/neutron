package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.MonthNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MonthNodeModule_ProvideMonthNodeFactory implements Factory<MonthNode> {
  private final MonthNodeModule module;

  public MonthNodeModule_ProvideMonthNodeFactory(MonthNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public MonthNode get() {
    return Preconditions.checkNotNull(
        module.provideMonthNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MonthNode> create(MonthNodeModule module) {
    return new MonthNodeModule_ProvideMonthNodeFactory(module);
  }

  /** Proxies {@link MonthNodeModule#provideMonthNode()}. */
  public static MonthNode proxyProvideMonthNode(MonthNodeModule instance) {
    return instance.provideMonthNode();
  }
}
