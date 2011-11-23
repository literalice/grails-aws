/**
 * 11/11/22
 *
 * Copyright (c) 2011 Monochromeroad
 */

package aws.ses

/**
 * 
 * 
 * @author <a href="mailto:literalice@monochromeroad.com">Masatoshi Hayashi</a>
 */
class SesSampleController {

    def index() { }

    def send() {
        def mailId = sesMail {
            charset "ISO-2022-JP"
            from params.from
            to params.to
            subject params.subject
            if (params.subtype == "html") {
                html params.body
            } else {
                body params.body
            }
            if (params.attachment) {
                attach params.attachment
            }
        }
        render view:"index", model:[mail:params + [id:mailId]]
    }

}
