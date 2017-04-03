import Promise from 'promise';
import moment from 'moment';

function delay(interval = 0) {
    return new Promise(
        (resolve) => {
            setTimeout(resolve, interval);
        }
    );
}

function defer(data) {
    return new Promise(
        (resolve) => {
            setTimeout(() => resolve(data), 10);
        }
    );
}

function setIsLoading(isLoading) {
    console.log(`executing setIsLoading(${isLoading})`);
    const items = document.getElementsByClassName('loading-spinner-component');
    if (items.length === 0)
        return;
    const spinner = items.item(0);
    if (isLoading) {
        spinner.classList.remove('hide');
    } else {
        spinner.classList.add('hide');
    }
}

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

const excludedNodeNames = ['addressRefListNode', 'errorListNode'];

function isExcluded(nodeName) {
    return excludedNodeNames.indexOf(nodeName) >= 0;
}

function extractObject(node) {
    const result = {};
    const children = node.getChildren();
    children.forEach((child) => {
        if (child.getNodeStatus() === GWT.NodeStatusEnum.Loaded && !isExcluded(child.getName())) {
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
    const result = {};
    const children = node.getChildren();
    children.forEach((child) => {
        if (child.getNodeStatus() === GWT.NodeStatusEnum.Loaded) {
            result[child.getName()] = extractValue(child);
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
        if (!isExcluded(child.getName())) {
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
    if (data) {
        for (const key in data) {
            if (Object.prototype.hasOwnProperty.call(data, key)) {
                //todo sort key first
                const item = data[key];
                if (item) {
                    let child = node.getItemByName(key);
                    if (!child) {
                        child = node.createItemWithName(key);
                    }
                    setValue(child, item);
                }
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

function replaceDigit(c, i, a) {
    return i && c !== '.' && ((a.length - i) % 3 === 0) ? `,${c}` : c;
}

function formatCurrency(n, symbol) {
    if (n === null || n === undefined)
        return '';
    const s = symbol || '$';
    return s + n.toFixed(2).replace(/./g, replaceDigit);
}

function formatDate(date) {
    if (!date)
        return '';

    return moment.utc(date).local().format('YYYY-MM-DD HH:mm:ss');
}

export default class CommonUtil {
}

CommonUtil.extractValue = extractValue;
CommonUtil.setValue = setValue;
CommonUtil.setIsLoading = setIsLoading;
CommonUtil.delay = delay;
CommonUtil.defer = defer;
CommonUtil.formatCurrency = formatCurrency;
CommonUtil.formatDate = formatDate;
