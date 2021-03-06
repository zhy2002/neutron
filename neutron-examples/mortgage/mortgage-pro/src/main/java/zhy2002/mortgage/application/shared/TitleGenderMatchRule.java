package zhy2002.mortgage.application.shared;

import zhy2002.mortgage.application.gen.node.GenderNode;
import zhy2002.mortgage.application.gen.node.TitleNode;
import zhy2002.neutron.core.EventBinding;
import zhy2002.neutron.core.UiNode;
import zhy2002.neutron.core.ValidationRule;
import zhy2002.neutron.core.di.Owner;
import zhy2002.neutron.core.event.StringStateChangeEventBinding;
import zhy2002.neutron.core.util.ValueUtil;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class TitleGenderMatchRule extends ValidationRule<TitleNode> {

    private static final Map<String, String> TITLE_GENDER_MAP;

    static {

        String male = "Male";
        String female = "Female";

        TITLE_GENDER_MAP = new HashMap<>();
        TITLE_GENDER_MAP.put("Mr", male);
        TITLE_GENDER_MAP.put("Mrs", female);
    }

    @Inject
    public TitleGenderMatchRule(@Owner TitleNode owner) {
        super(owner);
    }

    protected TitleNode getTitleNode() {
        return getOwner();
    }

    @Override
    protected UiNode<?> findHost() {
        return getOwner().getParent();
    }

    private GenderNode getGenderNode() {
        return getOwner().getParent().getGenderNode();
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Collections.singletonList(
                new StringStateChangeEventBinding(
                        e -> e.getOrigin() == getTitleNode() || e.getOrigin() == getGenderNode(),
                        e -> validate()
                )
        );
    }

    @Override
    protected String getErrorMessage() {
        if (isActivated())
            return "Invalid title for the selected gender.";
        return null;
    }

    private boolean isActivated() {
        TitleNode titleNode = getTitleNode();
        if (ValueUtil.isEmpty(titleNode.getValue()))
            return false;

        GenderNode genderNode = getGenderNode();
        if (ValueUtil.isEmpty(genderNode.getValue()))
            return false;

        return !isCompatible(titleNode.getValue(), genderNode.getValue());
    }

    private boolean isCompatible(String title, String gender) {
        String titleGender = TITLE_GENDER_MAP.get(title);
        if (titleGender == null)
            return true;

        return titleGender.equals(gender);
    }

}
