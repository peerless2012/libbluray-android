package io.github.peerless2012.bluray.media

import androidx.media3.common.util.UnstableApi
import androidx.media3.extractor.Extractor
import androidx.media3.extractor.ExtractorInput
import androidx.media3.extractor.ExtractorOutput
import androidx.media3.extractor.PositionHolder
import io.github.peerless2012.bluray.Bluray

/**
 * @Author peerless2012
 * @Email peerless2012@126.com
 * @DateTime 5/22/25 10:44 PM
 * @Version V1.0
 * @Description
 */
@UnstableApi
class BlurayExtractor : Extractor {

    private val bluray: Bluray = Bluray()

    constructor() {}


    override fun sniff(input: ExtractorInput): Boolean {
        TODO("Not yet implemented")
    }

    override fun init(output: ExtractorOutput) {
        TODO("Not yet implemented")
    }

    override fun read(input: ExtractorInput, seekPosition: PositionHolder): Int {
        TODO("Not yet implemented")
    }

    override fun seek(position: Long, timeUs: Long) {
        TODO("Not yet implemented")
    }

    override fun release() {
        TODO("Not yet implemented")
    }
}