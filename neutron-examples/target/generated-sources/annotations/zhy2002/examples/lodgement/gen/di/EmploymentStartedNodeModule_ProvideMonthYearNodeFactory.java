package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.MonthYearNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmploymentStartedNodeModule_ProvideMonthYearNodeFactory
    implements Factory<MonthYearNode<?>> {
  private final EmploymentStartedNodeModule module;

  public EmploymentStartedNodeModule_ProvideMonthYearNodeFactory(
      EmploymentStartedNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public MonthYearNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideMonthYearNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MonthYearNode<?>> create(EmploymentStartedNodeModule module) {
    return new EmploymentStartedNodeModule_ProvideMonthYearNodeFactory(module);
  }

  /** Proxies {@link EmploymentStartedNodeModule#provideMonthYearNode()}. */
  public static MonthYearNode<?> proxyProvideMonthYearNode(EmploymentStartedNodeModule instance) {
    return instance.provideMonthYearNode();
  }
}
