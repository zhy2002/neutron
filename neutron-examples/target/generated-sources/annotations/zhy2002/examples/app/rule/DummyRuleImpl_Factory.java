package zhy2002.examples.app.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.app.gen.node.LodgementNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DummyRuleImpl_Factory implements Factory<DummyRuleImpl> {
  private final MembersInjector<DummyRuleImpl> dummyRuleImplMembersInjector;

  private final Provider<LodgementNode> ownerProvider;

  public DummyRuleImpl_Factory(
      MembersInjector<DummyRuleImpl> dummyRuleImplMembersInjector,
      Provider<LodgementNode> ownerProvider) {
    assert dummyRuleImplMembersInjector != null;
    this.dummyRuleImplMembersInjector = dummyRuleImplMembersInjector;
    assert ownerProvider != null;
    this.ownerProvider = ownerProvider;
  }

  @Override
  public DummyRuleImpl get() {
    return MembersInjectors.injectMembers(
        dummyRuleImplMembersInjector, new DummyRuleImpl(ownerProvider.get()));
  }

  public static Factory<DummyRuleImpl> create(
      MembersInjector<DummyRuleImpl> dummyRuleImplMembersInjector,
      Provider<LodgementNode> ownerProvider) {
    return new DummyRuleImpl_Factory(dummyRuleImplMembersInjector, ownerProvider);
  }
}
