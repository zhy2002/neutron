function extractValue(node) {
    if (!node)
        return undefined;

    if (node.getChildCount) {
        return extractObject(node);
    } else if (node.getItemCount) {
        return extractList(node);
    }

    return extractLeaf(node);
}

function extractObject(node) {
    const result = {};
    const children = node.getChildren();
    children.forEach((child) => {
        if (child.getNodeStatus() === GWT.NodeStatusEnum.Loaded && child.getName() !== 'errorListNode') {
            let fieldName = child.getName();
            if (fieldName.endsWith('Node')) {
                fieldName = fieldName.substr(0, fieldName.length - 4);
            }
            result[fieldName] = extractValue(child);
        }
    });
    return result;
}

function extractList(node) {
    const result = [];
    const children = node.getChildren();
    children.forEach((child) => {
        if (child.getNodeStatus() === GWT.NodeStatusEnum.Loaded) {
            result.push(extractValue(child));
        }
    });
    return result;
}

function extractLeaf(node) {
    let value = node.getValue();
    if (node.getText) { //big decimal node
        const text = node.getText();
        value = text ? parseFloat(text) : null;
    }
    return value;
}

function setValue(node, data) {
    if (!data)
        return;

    if (node.getChildCount) {
        setObject(node, data);
    } else if (node.getItemCount) {
        setList(node, data);
    } else if (node.setValue) {
        setLeaf(node, data);
    }
}

function setObject(node, data) {
    const children = node.getChildren();
    children.forEach((child) => {
        if (child.getName() !== 'errorListNode') {
            let fieldName = child.getName();
            if (fieldName.endsWith('Node')) {
                fieldName = fieldName.substr(0, fieldName.length - 4);
            }
            if (data[fieldName]) {
                setValue(child, data[fieldName]);
            }
        }
    });
}

function setList(node, data) {
    if (data && data.length > 0) {
        for (let i = 0; i < data.length; i++) {
            const item = data[i];
            let child = node.getItemCount() === i ? child = node.createItem() : child = node.getItem(i);
            if (item) {
                setValue(child, item);
            }
        }
    }
}

function copyFields(target, source) {
    //todo deep copy
    for (const prop in source) {
        if (source[prop]) {
            target[prop] = source[prop];
        }
    }
}

function setLeaf(node, data) {
    if (node.setText) { //big decimal node
        if (data !== null) {
            node.setText(`${data}`);
        }
    } else {
        try {
            const value = node.getCopyOfValue();
            copyFields(value, data);
            node.setValue(value);
        } catch (e) {
            node.setValue(data);
        }
    }
}

export default class CommonUtil {
}

CommonUtil.extractValue = extractValue;
CommonUtil.setValue = setValue;