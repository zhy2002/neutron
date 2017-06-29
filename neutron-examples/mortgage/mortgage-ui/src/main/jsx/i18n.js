import i18next from 'i18next';

i18next.init({
    lng: 'en',
    debug: true,
    resources: {
        en: {
            translation: {
                Create: '[CREATE]',
                Open: '[OPEN]',
                Clone: '[CLONE]',
                Delete: '[DELETE]',
                Status: '[STATUS]',
                Refresh: '[REFRESH]',
                English: 'English',
                Chinese: 'Chinese',
                Validate: '[VALIDATE]',
                Clear: '[CLEAR]',
                'Get JSON': '[GET JSON]',
                Save: '[SAVE]',
                Add: 'Add',
                'App Manager': 'Form Manager'
            }
        },
        zh: {
            translation: {
                Create: '[创建]',
                Open: '[打开]',
                Clone: '[克隆]',
                Delete: '[删除]',
                Status: '[状态]',
                Refresh: '[刷新]',
                English: '英语',
                Chinese: '中文',
                Validate: '[验证]',
                Clear: '[清除]',
                'Get JSON': '[查看JSON]',
                Save: '[保存]',
                Add: '添加',
                'App Manager': '表单管理'
            }
        }
    }
});

export default i18next;
